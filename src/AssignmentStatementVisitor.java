public class AssignmentStatementVisitor implements StatementVisitor{

    private int level = 0;
    private String temp = "....";

    @Override
    public void visit(CompilationUnit compilationUnit) {
        System.out.println(temp.repeat(level)+"CompilationUnit");
        level ++;
        compilationUnit.root.accept(this);
        level --;

    }

    public void visit(AssignmentStatement assignStatement){
        System.out.println(temp.repeat(level)+"AssignmentExpression");
        level ++;
        assignStatement.a.accept(this);
        level --;

        level ++;
        assignStatement.b.accept(this);
        level --;
    }

    public void visit(AdditionExpression addExp){
        System.out.println(temp.repeat(level)+"AdditionExpression +");
        level ++;
        addExp.c.accept(this);
        level --;

        level ++;
        addExp.d.accept(this);
        level --;

    }

    public void visit(SubtractionExpression subExp){
        System.out.println(temp.repeat(level)+"SubstractionExpression -");
        level ++;
        subExp.e.accept(this);
        level --;

        level ++;
        subExp.f.accept(this);
        level --;
    }

    public void visit(IdentifierNode theNode){
        System.out.println(temp.repeat(level)+"IdentifierNode "+ theNode.getID());
    }
}
