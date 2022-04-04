package com.vishnevskiypro.rock_scissors_paper_composeedition

fun whoWin (human: String, computer: String): String {
    var result = ""
    if (human == computer){
        result = "Ничья !"
    } else if ((computer == "Rock" && human == "Paper")
        || (computer == "Paper" && human == "Scissors")
        || (computer == "Scissors" && human == "Rock")){
        result = "you WIN !!!"
    } else {
        result = "you lose (("
    }

        return "Human is $human, Computer is $computer, $result"
}