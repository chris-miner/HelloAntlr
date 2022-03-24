import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import dev.c00a5b70.hello.HelloBaseListener;
import dev.c00a5b70.hello.HelloParser;
import dev.c00a5b70.hello.HelloParser.RContext;

public class ExtractInterfaceListener extends HelloBaseListener {
    HelloParser parser;

    public ExtractInterfaceListener(HelloParser parser) {
        this.parser = parser;
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub
        super.enterEveryRule(ctx);
    }

    @Override
    public void enterR(RContext ctx) {
        // TODO Auto-generated method stub
        super.enterR(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub
        super.exitEveryRule(ctx);
    }

    @Override
    public void exitR(RContext ctx) {
        // TODO Auto-generated method stub
        super.exitR(ctx);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub
        super.visitErrorNode(node);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub
        super.visitTerminal(node);
    }

}
