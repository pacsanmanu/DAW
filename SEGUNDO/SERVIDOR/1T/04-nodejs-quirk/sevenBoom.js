let appears = false;

function checkBoom(list){
    if(list.includes(7)){
        console.log("Boom!");
        appears = true;
    }else if (!list.includes(7)){
        for(let i = 0; i < list.length; i++){
            const digits = list[i].toString().split('').map(Number);
            if(digits.includes(7)){
                appears = true;
            }
        }
        if(appears){
            console.log("Boom!");
        }
    }
    if(!appears){
        console.log("There's no 7's on the list.");
    }
}

const list = [process.argv[2], process.argv[3], process.argv[4], process.argv[5]];
checkBoom(list);