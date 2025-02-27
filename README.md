STARTING & TESTING:\
mvn -version, to check Maven version (if not installed, its required)\
Git clone the repo with: gitclone https://github.com/LuanMD1/teste-backend-auth.git \
To run unity tests: mvn test\
To start the API: mvn spring-boot:run\
\
API CALLING:\
Method: POST,\
Route: http://localhost:8080/auth/login )\
\
RESULTS:\
when OK:\
body: { "password": "Senha123@" }\
expects to return: { "success": true }\
\
when FAILS:\
body: { "password": "" }\
expects to return: \
{\
	"errors": [\
		"A senha deve ter pelo menos 9 caracteres",\
		"A senha deve conter pelo menos 1 dígito.",\
		"A senha deve conter pelo menos uma letra minúscula",\
		"A senha deve conter pelo menos 1 caractere especial (ex: !@#$%^&*()-+)."\
	],\
	"success": false\
}
