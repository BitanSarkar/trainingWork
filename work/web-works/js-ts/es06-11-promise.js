function divide(num1, num2){
    return new Promise((resolve,reject)=>{
        if(typeof num1 !== 'number') {
            reject("sorry please pass number");
            return;
        }
        if(typeof num2 !== 'number') {
            reject("sorry please pass number");
            return;
        }
        if(num2 === 0) {
            reject("don't divide my 0");
            return;
        }
        resolve(num1/num2);
    });
}
console.log("Start");
let num1 = 100;
let num2 = 0;
divide(num1,num2)
.then(res => console.log("Result", res))
.catch(err => console.log("Error", err))

// better version
try{
    let result = divide(num1, num2);
    result.then(res => console.log("Result", res))
}
catch(err){
    console.log(err);
}
// better version 2

setTimeout(async () => {
    try{
        let result = await divide(num1, num2);
        console.log("Result",result);
    }
    catch(err){
        console.log(err);
    }
});


console.log("End");