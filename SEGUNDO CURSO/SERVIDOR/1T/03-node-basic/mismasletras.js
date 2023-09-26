const os = process.argv[2].split("o").length;
const xs = process.argv[2].split("x").length;

if(os === xs){
    console.log("true");;
}else{
    console.log("false");
}