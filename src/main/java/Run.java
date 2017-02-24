import utils.ExcelUtil;

/**
 * Created by Administrator on 2017/2/25.
 */
public class Run {

    public static void main(String[] args) {
        //读取配置文件
        JsonObject conf = readJsonConf();
        List tableListConf = conf.get("sheet");
        //读取excel
        Sttring input = "";
        List<JsonObject> excelDataList = ExcelUtil.read(input);
        for(i,excelDataList){
            string failedColumn = ''
            JsonObject excelDataObj= excelDataList.get(i);
            for(j,tableListConf){
                String table = tableListConf.get("table");
                String selectType = tableListConf.get("selectType");
                String sql = tableListConf.get("sql");
                List<JsonObject> data = tableListConf.get("data");
                List<JsonObject> mysqlDataList = MysqlUtil.selectData(table,sql);
                String failed = compare(excelDataObj,mysqlDataList,data);
                failedColumn = failedColumn + failed;
            }
            if("".equals(failedColumn)){
                excelDataObj.put("result",0);
            }else {
                excelDataObj.put("result",1);
                excelDataObj.put("failedColumn",failedColumn);
            }
        }

        wrilteExcel();
    }
}
