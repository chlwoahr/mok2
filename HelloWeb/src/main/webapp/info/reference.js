// reference.js

const names = ['조수연','황진주','권가희','이유빈'];  // 배열선언

for(let i=0; i<names.length; i++){
  console.log((i+1)+'번째 이름:'+names[i]);
}

// enhanced for.(확장 for) for(String name : names){}
for(let name of names){
  console.log(name);
}

const numbers = [23,44,38,12,56];
for(let num of numbers){
  if(num>40){
    console.log(num);
  }
}
const inputs = [];
var sum = 0;
var avg = 0;
var cnt = 0;

for(let i=0; i<numbers.length; i++){
  var inputVal = prompt('값을입력하세요...');
  // console.log(typeof inputVal, inputVal);
  inputs[i] = parseInt(inputVal);
  sum += inputs[i];
  cnt ++;
}
avg = sum/cnt;
console.log(sum);

console.log(avg);

// 합계를 구하는, 평균:



