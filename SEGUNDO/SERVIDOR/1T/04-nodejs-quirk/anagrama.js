function anagrama(string1, string2){
    if(string1.length != string2.length){
        return false;
    }else{
        let chars1 = [...string1];
        let chars2 = [...string2];
        chars1.sort();
        chars2.sort();
        return chars1.every((value, index) => value === chars2[index]);
    }
}

const result = anagrama(process.argv[2], process.argv[3]);
console.log(result);