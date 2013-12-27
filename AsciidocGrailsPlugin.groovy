class AsciidocGrailsPlugin {
	def version = "0.1-SNAPSHOT"
	def grailsVersion = "2.0 > *"
	def pluginExcludes = []

	def title = "Asciidoc Plugin"
	def author = "Kenneth Liu"
	def authorEmail = "ken.liu@gmail.com"
	def description = '''Generates documentation from asciidoc sources using Asciidoctor via JRuby'''

	def documentation = "http://grails.org/plugin/asciidoc"
	def license = "APACHE"
	def issueManagement = [ system: "GITHUB", url: "https://github.com/kenliu/grails-asciidoc/issues" ]
	def scm = [ url: "http://github.com/kenliu/grails-asciidoc" ]
}
