def call(params = [:]) {
    echo "params= "+params
    mvnCmd = params['mvnCmd']
    if( mvnCmd == null ) {
        mvnCmd = "-Dmaven.test.failure.ignore clean package"
    }
    echo "Building maven snapshot"
}
