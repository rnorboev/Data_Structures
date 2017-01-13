
/**
 *
 * @author Ravshanbek
 */
private class StackADT <Position>;
        push_new_pos(int x, int y, StackADT<Position> stack)
{
Position npos = new Position();
npos.setx(x);
npos.sety(y);
if (valid(npos.getx(),npos.gety()))
stack.push(npos);
return stack;
}