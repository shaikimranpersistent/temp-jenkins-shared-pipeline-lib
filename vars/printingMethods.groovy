def printStageStartMsg(String stageName) {
    stageName = stageName.toUpperCase();
    echo """\n\033[97m\033[43m\tStarting ${stageName} stage 🛠️\t\033[0m\n"""
}

def printStageSuccessMsg(String stageName) {
    stageName = stageName.toUpperCase();
    echo """\n\033[97m\033[42m\t${stageName} stage proceeded successfully 👏\t\033[0m\n""" 
}

def printStageFailedMsg(String stageName) {
    stageName = stageName.toUpperCase();
    echo """\n\033[97m\033[41m\t${stageName} stage failed 😥\t\033[0m\n"""
}