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
function modStudent(e) {

}   //end of addStudent(e)

function addStudent(e) {
	e.preventDefault(); // submit 차단
	console.log(e);
	let no = document.querySelector('input[name="sno"]').value;
	let name = document.querySelector('input[name="sname"]').value;
	let eng = document.querySelector('input[name="eScore"]').value;
	let kor = document.querySelector('input[name="kScore"]').value;

	let xhtp = new XMLHttpRequest(); //비동기방식으로 서버의 파일요청 -> 처리된결과 받아옴
	xhtp.open('get', `addStudentServlet?sno=${no}&sname=${name}&eScore=${eng}&kScore=${kor}`)
	xhtp.send(); //요청
	xhtp.onload = function() {
		console.log(xhtp.responseText); //  {"retCode":"Success"}
		let result = JSON.parse(xhtp.responseText); //responseText 요청결과값 {"retCode":"Success"}
		if (result.retCode == 'Success') {
			// 리스트 새로운 값 추가.
			successCallBack2(result);
		} else if (result.retCode == 'Fail') {
			// 처리중 에러가 발생.
			failCallBack()
		}
	}// end of function
} //end addStudent(e)

function makeTr(student) {

	let tr = document.createElement('tr');
	tr.setAttribute('id', student.studentNo); // id 속성부여 라인삭제를 id => (아이디를 갖고와서 지울용도)getElementById(id).remove();
	for (let e in student) {
		let td = document.createElement('td');
		td.innerHTML = student[e];
		tr.appendChild(td);

	}
	//삭제버튼 생성
	let delBtn = document.createElement('button');//<button></button>
	delBtn.innerHTML = '삭제';

	// 이벤트 등록.
	delBtn.addEventListener('click', function() {
		// 삭제(id파악 => ajax호출.) : this => 이벤트 대상엘리먼트(delBtn);
		let id = this.parentElement.parentElement.firstChild.innerHTML;
		console.log(id);
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



	let td = document.createElement('td');
	td.appendChild(delBtn);
	tr.appendChild(td);
	return tr
};// end makTr
function successCallBack2(retObj) {
	console.log(retObj);
	let obj = {
		studentNo: retObj.studentNo,
		studName: retObj.studName,
		engScore: retObj.engScore,
		korScore: retObj.korScore,


	}
	document.getElementById('list').appendChild(makeTr(obj));


};// end successCallBack2

function successCallBack() {
	// 사용자 입력값을 id='list' 하위 추가.
	let no = document.querySelector('input[name="sno"]').value;
	let name = document.querySelector('input[name="sname"]').value;
	let eng = document.querySelector('input[name="eScore"]').value;
	let kor = document.querySelector('input[name="kScore"]').value;


	let row =
	{
		no: no,
		na: name,
		en: eng,
		ko: kor
	};
	document.getElementById('list').appendChild(makeTr(row));
}


function failCallBack() {
	alert('처리중 에러발생.')
}




