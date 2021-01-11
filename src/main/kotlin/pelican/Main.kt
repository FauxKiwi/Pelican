package pelican

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main() {
    val lexer = PelicanLexer(
        CharStreams.fromString("""
        void test() {
            int a = (a, b) => { a; };
        }
    """.trimIndent()))
    val parser = PelicanParser(CommonTokenStream(lexer))

    val transpiler = PelicanTranspiler()

    val translationUnitContext = parser.translation_unit()

    transpiler.enterTranslation_unit(translationUnitContext)
}