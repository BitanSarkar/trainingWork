const {generateText, checkAndGenerateText, createElement, testSample, testSample1} = require("../script/util")
 

describe('unit testing for the functions written to put data', () => {
        test('should be able to pass the test when valid name and age is given', () => {
            const name = "Akhilesh"
            const age = 22 

            let returnText = generateText(name, age)
            let expectedResult = `${name} is ${age} years old`
            expect(returnText).toBe(expectedResult)
        })
        test("should fail the test case when the values are not given", () => {
            const name = ""
            const age = 0
            
            let returnText = generateText(name, age)
            let expectedResult = ` is 0 years old`
            expect(returnText).toBe(expectedResult)
            
        })
        describe("This is test for sample code" , () => {
            test("Should return the proper value provided username and city", ()=> {
                let name = "Bitan";
                let city = "bangalore"
                let expectedResult = `${name} lives in ${city}`;
                let returnText = testSample(name, city);
                expect(returnText).toBe(expectedResult);
            })
        })
        describe("This is test for sample code bitan made" , () => {
            test("Should return the proper value provided username and city and vote details", ()=> {
                let name = "Bitan";
                let city = "bangalore"
                let state = "KA"
                let age = 45
                let expectedResult =  `${name} lives is ${city} which is from ${state} and he ${age>=18?'can':'cannot'} vote`;
                let returnText = testSample1(name, city, state, age);
                expect(returnText).toBe(expectedResult);
            })
        })

})
