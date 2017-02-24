package controller;

/**
 * Created by Administrator on 2017/2/25.
 */
public class Compare {
    JsonObject excelDataObj;
    List<JsonObject> mysqlDataList;
    List<JsonObject> data;

    public Compare(JsonObject excelDataObj, List<JsonObject> mysqlDataList, List<JsonObject> data) {
        ===
    }

    public String excute(){
        StringBuffer sb = new StringBuffer();
        for(i,data){
            JsonObject columnObjConf = data.get(i);
            String excelColumn = columnObjConf.get("source");
            String mysqlColumn = columnObjConf.get("target");
            if(mysqlDataList.isEmpty()){
                if(excelDataObj.get(cloumn).equels("无") || excelDataObj.get(cloumn).equels("其他")){
                    //单独处理
                }else {
                    //看看是不是身份证号码和已有字段重复了
                }
            }
            if("1V1".equals(columnObjConf.get("verifyType"))){
                int result = verify(excelDataObj.get(excelColumn),mysqlDataList.get(0）.get(mysqlColumn)));
            }else if("map".equals(columnObjConf.get("verifyType"))){
                int result = verify(excelDataObj.get(excelColumn),mysqlDataList.get(0）.get(mysqlColumn)));
            }else if("1Vn".equals(columnObjConf.get("verifyType"))){
                int result = verify1(excelDataObj.get(excelColumn),mysqlDataList.get(0）.get(mysqlColumn)));
            }else {
                //出错了
            }
            sb.append(result);
        }
        return sb.toString();
    }

    public int verify(String excelValue,String mysqlValue){
        if(相等){
            return 0;
        }else {
            return 1;
        }
    }

    public int verify(String excelColumn, String excelValue,String mysqlValue){
        //加载配置文件conf
        if(conf.notcontain()){
            //报错
        }else {
            excelValueNew = conf.get(excelColumn).get(excelValue);
            if(excelValueNew == mysqlValue){
                return 0;
            }else {
                return 1;
            }
        }
    }

}
