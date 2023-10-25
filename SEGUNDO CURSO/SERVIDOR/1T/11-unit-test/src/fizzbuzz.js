export function fizzbuzz(num){
    let text = "";
    if(num % 3 === 0) text += "fizz";
    if(num % 5 === 0) text += "buzz";
    return text || num;
}