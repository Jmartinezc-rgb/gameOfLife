compilar:limpiar
	mkdir bin
	find src -name *.java | xargs javac -cp bin -d bin
ejecutar:compilar
	java -cp bin aplicacion.Principal
limpiar:
	rm -rf bin
jar:compilar
	jar cvfm GameOfLife.jar Manifest.txt -C bin .
javadoc:jar
	rm -rf html
	mkdir html
	find . -type f -name "*.java" | xargs javadoc -d html -encoding utf-8 -charset utf-8
run : javadoc