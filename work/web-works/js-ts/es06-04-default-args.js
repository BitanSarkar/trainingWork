function calculateTax(salary, tax=0, incentives=0){
//    tax = tax || 0;
//    incentives = incentives || 0;
    return salary-tax+incentives;
}

let netSalary = calculateTax(1000,undefined, 120);

console.log(netSalary);