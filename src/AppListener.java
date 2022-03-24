import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import dev.c00a5b70.hello.HelloBaseListener;
import dev.c00a5b70.hello.HelloParser;
import dev.c00a5b70.hello.HelloParser.RContext;

public class AppListener extends HelloBaseListener {
    HelloParser parser;

    public AppListener(HelloParser parser) {
        this.parser = parser;
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        System.out.println("enterEveryRule: " + ctx.getClass().getSimpleName());
        super.enterEveryRule(ctx);
    }

    @Override
    public void enterR(RContext ctx) {
        System.out.println("enterR: " + ctx.getClass().getSimpleName());
        super.enterR(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        System.out.println("exitEveryRule: " + ctx.getClass().getSimpleName());
        super.exitEveryRule(ctx);
    }

    @Override
    public void exitR(RContext ctx) {
        System.out.println("exitR: " + ctx.getClass().getSimpleName());
        super.exitR(ctx);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        System.out.println("visitErrorNode: " + node.getClass().getSimpleName());
        super.visitErrorNode(node);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        System.out.println("visitTerminal: " + node.getClass().getSimpleName());
        super.visitTerminal(node);
    }

}
