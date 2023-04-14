var listArray = ["{{()}}","{{{{","{}()[]"];

(function soutData(listArray){
    for(let i = 0; i < listArray.length; i++){
        console.log(isBalanced(listArray[i]));
    }
})(listArray);

function isBalanced (strings){
    let newVector = [];
    for(let i = 0; i < strings.length; i++){
        if(strings[i] == "(" || strings[i] == "{" || strings[i] == "["){
            newVector.push(strings[i]);
        } else{
            //if(newVector.length == 0) return "NO"
            if ((strings[i] == ")" && newVector[newVector.length - 1 ]=="(") && (strings[i] != "}" || strings[i] != "]") ){
                newVector.pop();
                continue;
            }else if((strings[i] == "}" && newVector[newVector.length - 1]=="{") && (strings[i] != ")" || strings[i] != "]")){
                newVector.pop();
                continue;
            }else if((strings[i] == "]" && newVector[newVector.length - 1]=="[") && (strings[i] != "}" || strings[i] != "]")){
                newVector.pop();
                continue;
            }
            else{
                return "NO";
            }
        }
    }

    return newVector.length == 0 ? "YES":"NO";
}