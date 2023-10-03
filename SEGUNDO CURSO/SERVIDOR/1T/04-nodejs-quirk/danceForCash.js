const moves = ["Shimmy", "Shake", "Pirouette", "Slide", "Box Step", "Headspin", "Dosado", "Pop", "Lock", "Arabesque"];

function danceConvert(pin) {
    let acumulator;
    const digits = [...pin];
    const dance = [];
    digits.every((digit, index) => {
        acumulator = parseInt(digit) + index;
        if(acumulator > 9){
            while(acumulator > 9){
                acumulator -= 10;
            }
            dance.push(moves[acumulator]);
        }else{   
            dance.push(moves[acumulator]);
        }
        return true;    
    });

    console.log('Dance Convert --> from ' + digits + ' to ' + dance);
}

danceConvert(process.argv[2]);