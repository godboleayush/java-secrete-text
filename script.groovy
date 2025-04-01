def buildApp(){
    if (PORT == '8000') {
        echo "Everything is fine"
    } else {
        echo "Port is not 8000, something is not fine"
    }
}

def deployApp(){
    echo "deploy reached"
}

return this