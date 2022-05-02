/**
 * ajax.js
 */
 
 //비동기.
 
 let val = 10;
 setTimeout(function(){
 val +=5;
 console.log('hello -> ' + val);
  setTimeout(function(){
 val +=3;
 console.log('hello2->' + val);
 
 },1000); // (실행할함수, 시간 텀을 두고 실행)
   setTimeout(function(){
 val +=4;
 console.log('hello3->' + val);
 
 },1000); // (실행할함수, 시간 텀을 두고 실행)
 },2000); // (실행할함수, 시간 텀을 두고 실행)
 
 let success = true;								
let promise = new Promise(function(resolve, reject){ // Promise = 성공, 에러 함수 실행 
	if(success){
	resolve('success');//정상시 resolve 실행
	}else{	
	reject('error');//에러시 reject 실행
	}
} );
// Promise 메소드 
promise.then(function(result){ //정상시 then(resolve) 실행 
		console.log(result);
		}) 
		.then(function(result){
		console.log(result);
		})
		.then(function(result){
		console.log(result);
		})
	   .catch(function(err){ //에러시 catch(reject) 실행
	     console.log(err)
	   }); 
