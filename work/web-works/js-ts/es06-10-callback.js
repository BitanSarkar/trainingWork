console.log("start of script");


function divide(num1, num2, callback) {
    if(typeof callback !== 'function') {
        throw new Error("sorry please pass function");
    }
    setTimeout(()=>{
        if(typeof num1 !== 'number') {
           callback("sorry please pass number");
           return;
        }
        if(typeof num2 !== 'number') {
           callback("sorry please pass number");
           return;

        }
        if(num2 === 0) {
            callback("2nd arg cannot be 0");
            return;
        }
        callback(null, num1/num2)
        return;
    },1000);
}

let result = divide(10,0, (err,res)=>{
    if(err){
        console.log("Error : " , err);
    }
    else {
        console.log("Result : ", res);
    }
});
console.log("End of script");


