package com.zishala.healthcode;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class CodeGenerator {
  public static void main(String[] args) {
    //1.获取代码生成器的对象
    AutoGenerator autoGenerator = new AutoGenerator();

    //设置数据库相关配置
    DataSourceConfig dataSource = new DataSourceConfig();
    dataSource.setDriverName("com.mysql.cj.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql://124.222.180.235:3306/healthcode?serverTimezone=UTC");
    dataSource.setUsername("healthcode");
    dataSource.setPassword("123456");
    autoGenerator.setDataSource(dataSource);

    //设置全局配置
    GlobalConfig globalConfig = new GlobalConfig();
    globalConfig.setOutputDir(System.getProperty("user.dir")+"/src/main/java");    //设置代码生成位置
    globalConfig.setOpen(false);    //设置生成完毕后是否打开生成代码所在的目录
    globalConfig.setAuthor("kallen");    //设置作者
    globalConfig.setFileOverride(true);     //设置是否覆盖原始生成的文件
    globalConfig.setMapperName("%sDao");    //设置数据层接口名，%s为占位符，指代模块名称
    globalConfig.setIdType(IdType.ASSIGN_ID);   //设置Id生成策略
    autoGenerator.setGlobalConfig(globalConfig);

    //设置包名相关配置
    PackageConfig packageInfo = new PackageConfig();
    packageInfo.setParent("com.zishala.healthcode");   //设置生成的包名，与代码所在位置不冲突，二者叠加组成完整路径
    packageInfo.setEntity("domain");    //设置实体类包名
    packageInfo.setMapper("dao");   //设置数据层包名
    autoGenerator.setPackageInfo(packageInfo);

    //策略设置
    StrategyConfig strategyConfig = new StrategyConfig();
    strategyConfig.setInclude("table_acid_info","table_area","table_authority",
                              "table_district_manager","table_health_code_appeal",
                              "table_hospital_info","table_long_test_site","table_patient_info",
                              "table_policy","table_positive_info","table_role",
                              "table_role_with_authority","table_short_test_site",
                              "table_site_apply","table_site_code","table_site_code_info",
                              "table_super_manager","table_test_institution",
                              "table_test_site","table_test_tube","table_tester",
                              "table_tester_work","table_trip_info","table_user",
                              "table_vaccine_info");  //设置当前参与生成的表名，参数为可变参数
    strategyConfig.setTablePrefix("table_");  //设置数据库表的前缀名称，模块名 = 数据库表名 - 前缀名  例如： User = tbl_user - tbl_
    strategyConfig.setRestControllerStyle(true);    //设置是否启用Rest风格
    strategyConfig.setVersionFieldName("version");  //设置乐观锁字段名
    strategyConfig.setLogicDeleteFieldName("deleted");  //设置逻辑删除字段名
    strategyConfig.setEntityLombokModel(true);  //设置是否启用lombok
    strategyConfig.setNaming(NamingStrategy.underline_to_camel); // 设置驼峰命名
    autoGenerator.setStrategy(strategyConfig);
    //2.执行生成操作
    autoGenerator.execute();
  }
}