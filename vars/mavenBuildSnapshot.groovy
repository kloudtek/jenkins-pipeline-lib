def call(args) {
    echo "foo"
}

//def call(Map<String,String> params = [:]) {
//    echo "XX"
//    mvnCmd = params['mvnCmd']
//    if( mvnCmd == null ) {
//        mvnCmd = "-Dmaven.test.failure.ignore clean package"
//    }
//    echo "Building maven snapshot"
//}