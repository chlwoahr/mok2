/**
 * 
 */

/**
* post.js
*/

document.addEventListener('DOMContentLoaded', init);

// 리스트.
function init() {
	let xhtp = new XMLHttpRequest();
	xhtp.open('get', '../studentList.json')
	xhtp.send();
	xhtp.onload = function() {
		let data = JSON.parse(xhtp.responseText); // json -> object.
		console.log(data);
		let tbodyList = document.getElementById('list');
		data.forEach(function(elem) { // elem이 스튜던트 1건 1건임
			let newTr = makeTr(elem);
			tbodyList.appendChild(newTr);
		})
	}// end of onload
	let modBtn = document.querySelector('input[type=button]');
	modBtn.addEventListener('click', function() {
		let no = document.querySelector('input[name=sno]').value;
		let name = document.querySelector('input[name=sname]').value;
		let eScore = document.querySelector('input[name=eScore]').value;
		let kScore = document.querySelector('input[name=kScore]').value;


		let xhtp = new XMLHttpRequest();
		xhtp.open('get', `modStudentServlet?a=${no}&b=${name}&c=${eScore}&d=${kScore}`);
		xhtp.send();
		xhtp.onload = function() {
			let result = JSON.parse(xhtp.responseText);
			if (result.retCode == 'OK') {
				// 결과값으로 받은 값을 => 새로운 tr.
				let obj = {
					studentNo: result.studentNo,
					studentName: result.studentName,
					engScore: result.engScore,
					korScore: result.korScore
				}
				let newTr = makeTr(obj);
				let oldTr = document.getElementById(result.studentNo);
				document.getElementById('list').replaceChild(newTr, oldTr);// 새로운 tr => 이전 tr 대체.
			} else {
				alert('변경 중 오류.')
			}

		}
	})
} //end of init()

// 변경처리.
function modStudent(e) {

}   //end of addStudent(e)


// 한건 추가.
function addStudent(e) {
	e.preventDefault(); // submit -> 차단.
	console.log(e);

	let no = document.querySelector('input[name="sno"]').value;
	let name = document.querySelector('input[name="sname"]').value;
	let eng = document.querySelector('input[name="eScore"]').value;
	let kor = document.querySelector('input[name="kScore"]').value;

	let xhtp = new XMLHttpRequest(); //비동기 방식으로 서버의 파일요청.
	xhtp.open('get', `addStudentServlet?sno=${no}&sname=${name}&eScore=${eng}&kScore=${kor}`);
	xhtp.send();
	xhtp.onload = function() {
		console.log(xhtp.responseText); //{"retCode":"Success"}
		let result = JSON.parse(xhtp.responseText); // {retCode:"Success"}
		if (result.retCode == 'Success') {

			// 리스트 새로운 값 추가.
			successCallBack2(result); // {retCode:?, studNo:?, studName:?, eScore:?, kScore:?}
		} else if (result.retCode == 'Fail') {
			// 처리중 에러가 발생.
		}
	}   // end of function()
}   //end of addStudent(e)

function makeTr(student) {
	let tr = document.createElement('tr');
	tr.setAttribute('id', student.studentNo); // 라인삭제를 id => getElementById(id).remove();, id를 지정해놓고 겟엘리먼트바이아이디로 아이디값을 가져오고 그 아이디값을 선언해서 지움
	for (let field in student) { // student['studNo']
		let td = document.createElement('td')
		td.innerHTML = student[field];
		tr.appendChild(td);
	};
	// 삭제버튼 생성.
	let delBtn = document.createElement('button'); // <button></button>
	delBtn.innerHTML = '삭제';

	// 이벤트 등록.
	delBtn.addEventListener('click', function() {
		// 삭제(id파악 => ajax호출.) : this => 이벤트
		let id = this.parentElement.parentElement.firstChild.innerHTML;

		let xhtp = new XMLHttpRequest();
		xhtp.open('get', 'delStudentServlet?delId=' + id);
		xhtp.send();
		xhtp.onload = function() {
			let result = JSON.parse(xhtp.responseText);
			if (result.retCode == 'OK') {
				alert(result.retVal + '번이 삭제되었습니다.');
				document.getElementById(result.retVal).remove();
			} else {
				console.log(result.retVal);
			}
		}
	});


	let td = document.createElement('td'); // <td></td>
	td.appendChild(delBtn); // <td><button>삭제</button></td>
	tr.appendChild(td);

	return tr;

} // end of makeTr(student)

function successCallBack2(retObj) {
	console.log(retObj)
	let obj = {
		studentNo: retObj.studentNo,
		studentName: retObj.studentName,
		engScore: retObj.engScore,
		korScore: retObj.korScore
	}
	document.getElementById('list').appendChild(makeTr(obj));
	// end of successCallBack2

	function successCallBack() {
		//사용자 입력값을 id="list" 하위 추가.
		let no = document; querySelector('input[name="sno"]').value;
		let name = document; querySelector('input[name="sname"]').value;
		let eng = document; querySelector('input[name="eScore"]').value;
		let kor = document; querySelector('input[name="kScore"]').value;

		let obj = {
			studNo: no,
			studName: name,
			engScore: eng,
			korScore: kor
		};
		let row = makeTr();
		document.getElementById('list').appendChild(row);
	}

	function failCallBack() {
		alert('처리중 에러발생.')
	}
}