<html lang="zh-cmn-Hans">
    <#include "../common/header.ftl">
<body>

<div class="container-fluid">
    <div class="row">
        <!--	侧边栏	 -->
        <#include "../common/nav.ftl">
        <!--	主要内容	-->
        <main role="main" class="col-10 ml-auto">
            <div class="row p-4">
                <table class="table table-light table-striped table-bordered table-hover">
                    <thead class="thead-dark">
                    <tr>
                        <th scope="col">类目id</th>
                        <th scope="col">名称</th>
                        <th scope="col">类目编号</th>
                        <th scope="col">创建时间</th>
                        <th scope="col">更新时间</th>
                        <th scope="col">操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#list categoryList as category>
                    <tr>
                        <td>${category.categoryId}</td>
                        <td>${category.categoryName}</td>
                        <td>${category.categoryType}</td>
                        <td>${category.createTime}</td>
                        <td>${category.updateTime}</td>
                        <td><a href="/sell/seller/category/index?categoryId=${category.categoryId}">修改</a></td>
                    </tr>
                    </#list>
                    </tbody>
                </table>
            </div>
        </main>
    </div>
</div>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<script>
    <#---->
</script>

</body>
</html>
