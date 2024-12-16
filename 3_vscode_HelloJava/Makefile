ENTRY=Main
SRC=src

run: $(SRC)/$(ENTRY).class
	java -cp . $(SRC).$(ENTRY)

$(SRC)/$(ENTRY).class: $(SRC)/$(ENTRY).java
	javac -cp $(SRC) $(SRC)/*.java

.PHONY: run $(SRC)/$(ENTRY).class
.SILENT: run $(SRC)/$(ENTRY).class