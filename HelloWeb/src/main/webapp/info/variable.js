// variable.js
// 변수선언, //선언하는 시점에 타입이 정해짐
var myName = '최재목';  // string
var yourName; // underfined
myName = 100; //number
myName = true; // boolean
myName = null; // object
//console.log 출력기능
console.log(typeof yourName); //출력전 선언되어있는 변수를 먼저 체크한다.
var yourName = "홍길동";
console.log(typeof yourName);

//전역변수(스크립트변수), 지역변수(함수안의 변수)

function checkInfo(){
 var myName = 'LeeChangho'; // myName 지역변수 설정
  console.log(myName);
}
checkInfo();
console.log(myName); //전역변수 마지막 변수선언이 null로 null출력

// ES6 (es2015) => let, const(상수선언)
// let 블럭레벨 변수선언.
function info(){
  let myName = 'Hong';
  console.log(myName);
}
info()
{
  let myName = 'Hong';
  console.log(myName);
}
{
  let myName = 'Hwang';
  console.log(myName);
}

const otherName = 'Hong'; // 상수선언으로 값변경불가
// otherName = 'HHHH';

//var, let => 변수선언.
// const => 상수선언.