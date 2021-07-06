let p1 = {
    name: "Bitan",
    city: "Kolkata",
    email: "bitan@gmail.com",
    address: {
        hno: 123,
        city: "Kolkata",
        state: "West Bengal",
        country: "India"
    }
}

let {name, email, address} = p1;
console.log(name,email, address);

let num = [45,68,45,12,35,10,33,41,78];
let [num1, num2, ...others] = num;
console.log(`First number : ${num1} and Second number : ${num2} and rest are ${others}`);
