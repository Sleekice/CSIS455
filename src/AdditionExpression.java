/**
 *
 *
 *
        Author : Peter Tiewah
        Date: 09/20/2020
        Description: This Program reads the addition expression
 *
 *
        */

public class AdditionExpression implements Node{

 IdentifierNode c = new IdentifierNode('b');
 SubtractionExpression d = new SubtractionExpression();

 @Override
 public void accept(StatementVisitor statementVisitor) {
  statementVisitor.visit(this);
 }
}
