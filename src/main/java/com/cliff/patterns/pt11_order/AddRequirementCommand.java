package com.cliff.patterns.pt11_order;

/**
 * author:CliffLeopard
 * date:2021/9/7
 * time:08:28
 * email:precipiceleopard@gmail.com
 * link:
 */
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        pageGroup.find();
        requirementGroup.delete();
        requirementGroup.change();
        pageGroup.change();
        codeGroup.change();
    }
}
