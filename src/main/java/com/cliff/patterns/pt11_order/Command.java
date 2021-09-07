package com.cliff.patterns.pt11_order;

/**
 * author:CliffLeopard
 * date:2021/9/7
 * time:08:26
 * email:precipiceleopard@gmail.com
 * link:
 */
public abstract class Command {
    protected Group codeGroup = new CodeGroup();
    protected Group pageGroup = new PageGroup();
    protected Group requirementGroup = new RequirementGroup();

    public abstract void execute();
}
