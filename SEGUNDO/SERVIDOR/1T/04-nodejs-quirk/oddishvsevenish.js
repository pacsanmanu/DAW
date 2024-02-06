function oddishVsEvenish(number){
    let result = 0;
    const digits = number.toString().split('').map(Number);
    for(let i = 0; i < digits.length; i++){
        result += digits[i];
    }
    if(result % 2 === 0){
        return 'Evenish';
    }else{
        return 'Oddish';
    }
}

console.log(oddishVsEvenish(process.argv[2]));