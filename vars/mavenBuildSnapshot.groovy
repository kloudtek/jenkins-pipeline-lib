def call(Map<String,String> params) {
    mvnCmd = params['mvnCmd'];
    if( mvnCmd == null ) {
        mvnCmd = "-Dmaven.test.failure.ignore clean package"
    }
}