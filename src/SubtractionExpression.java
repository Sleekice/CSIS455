public class SubtractionExpression implements Node{

    IdentifierNode e = new IdentifierNode('c');
    IdentifierNode f = new IdentifierNode('d');
    @Override
    public void accept(StatementVisitor statementVisitor){
        statementVisitor.visit(this);
    }
}
