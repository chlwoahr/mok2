// object.js {key: value},{key: value} 키와값을 쌍으로 갖고있는 변수 11
let member1 = {
  fullName: 'hong',
  age: 20,
  score: 80
}; 
let member2 = {
  fullName: 'hwang',
  age: 22,
  score: 88
};
let member3 = {
  fullName: 'park',
  age : 25,
  score: 92
}// 오브젝트 타입 java 클래스와 비슷
member1.fullName='홍';
console.log(member1.fullName);
console.log(member2.age);
console.log(member1.age+member2.age);

const members = [member1,member2,member3];
// 홍의 나이는 20이고 점수는 80입니다.
for(let i =0 ; i <members.length ; i++){
  console.log(members[i].fullName+'의 나이는 '+members[i].age+'이고 점수는 '+members[i].age+'입니다')
}

document.write('<h1>Hong</h1>'); //페이지에 보여줄수있게

document.write('<ul>');
for(let i =0; i<members.length ; i++){
  // document.write('<li>'+members[i].fullName+'의 나이는 '+members[i].age+'이고 점수는 '+members[i].age+'입니다'+'</li>')
  document.write(`<li>${members[i].fullName} 의 나이는 ${members[i].age} 이고 점수는 ${members[i].age}입니다</li>`)
}
document.write('</u>');
// ` ` 사이에 문자 줄바꿈 인식 변수의경우 ${}로 구분

let welcome = `안녕하세요.
반갑습니다`;
console.log(welcome);