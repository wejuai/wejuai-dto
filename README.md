# wejuai-dto
跨模块使用的数据传输对象

### 结构
- dto：不同类型的实体
    - request：请求
    - response：响应
- Constant：常量

### 配置
`build.gradele`中配置仓库地址，以及拥有权限的github key

### 使用
1. gradle构建成功
2. 运行gradle task中的`publishing/publishToMavenLocal`安装到本地
3. 运行`publishing/publish`发布到对应仓库的packages中