def call(Map<String,String> params) {
    mvnCmd = params['cmd']
    if( mvnCmd == null ) {
        error "ktmvn missing parameter: cmd"
    }
}