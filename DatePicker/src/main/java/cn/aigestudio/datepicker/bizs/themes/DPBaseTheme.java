package cn.aigestudio.datepicker.bizs.themes;

/**
 * 主题的默认实现类
 * 
 * The default implement of theme
 *
 * @author AigeStudio 2015-06-17
 */
public class DPBaseTheme extends DPTheme {

    @Override
    public int colorBG() {
        return 0xFFFFFFFF;
    }//背景

    @Override
    public int colorBGCircle() {
        return 0x44000000;
    } //点击背景

    @Override
    public int colorTitleBG() {
        return 0xFFFF6D6A;
    } //标题背景

    @Override
    public int colorTitle() {
        return 0xEEFFFFFF;
    } //标题颜色

    @Override
    public int colorToday() {
        return 0xFFFF6D6A;
    } //选中颜色

    @Override
    public int colorG() {
        return 0xFF202020;
    } //文字颜色(不是周六日)

    @Override
    public int colorF() {
        return 0xFF202020;
    } //节日颜色设置

    @Override
    public int colorWeekend() {
        return 0xFF303F9F;
    } //周六日文字颜色

    @Override
    public int colorHoliday() {
        return 0xFFFF6D6A;
    }
}
