package org.bsnyder.groovy

class Hello {

	static void main(String[] args) {
		def name
		if (args.length > 0) {
			name = args[0]
		} else {
			name = "World!"
		}
		println "Hello " + name + "!"
	}
}
