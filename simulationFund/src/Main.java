/**
 * @ClassName 模拟基金定投
 * @Description 模拟基金定投
 * @Author sq_lw
 * @Date 2020/4/26 14:54
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        //投资本金
        double myMoney = 1000.00;
        //基础净值
        double originalNetWorth = 1.00;
        //累计增涨
        double sumGroup = 0.00;
        //累计下降
        double sumDecline = 0.00;
        //综合涨幅
        double synthesizeGroup = 0.00;
        //模拟天数
        int days = 300;
        //模拟涨跌项(增涨会多一些)
        double[] randomGroup = {-0.01, -0.02, -0.02, -0.02, -0.02, -0.03, 0.01, 0.02, 0.02, 0.02, 0.02, 0.03, 0.03};
        //昨日涨跌幅
        double yesterday = 0.00;
        //定投金额
        double addMoney = 10.00;
        //累计定投金额
        double synthesizeaddMoney=0.00;
        //模拟定投
        for (int i = 1; i <= days; i++) {
            //产生随机涨跌幅
            int index = (int) (Math.random() * randomGroup.length);
            double random = randomGroup[index];
            yesterday = random;
            //叠加累计涨幅
            synthesizeGroup = synthesizeGroup + random;
            synthesizeGroup = Double.parseDouble(String.format("%.2f", synthesizeGroup));
            //叠加累计涨跌幅，并定投今日的金额
            if (random > 0) {
                sumGroup += random;
                sumGroup = Double.parseDouble(String.format("%.2f", sumGroup));
            } else {
                sumDecline += random;
                sumDecline = Double.parseDouble(String.format("%.2f", sumDecline));
                addMoney = 20.00;
            }
            //计算截止昨日的本金+利润
            myMoney = myMoney * (1 + yesterday);
            myMoney = Double.parseDouble(String.format("%.2f", myMoney));
            synthesizeaddMoney += addMoney;
            synthesizeaddMoney = Double.parseDouble(String.format("%.2f", synthesizeaddMoney));
            myMoney = myMoney + addMoney;

        }
        System.out.println("累计增涨：" + sumGroup);
        System.out.println("累计下降：" + sumDecline);
        System.out.println("综合涨幅：" + synthesizeGroup);
        System.out.println("累计定投金额：" + synthesizeaddMoney);
        System.out.println("毛利+本金：" + myMoney);
        System.out.println("毛利：" + (myMoney-synthesizeaddMoney-100));
    }
}
