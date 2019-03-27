<!--	侧边栏	 -->
<nav class="nav col-2 bg-dark sidebar">
    <ul class="nav nav-tabs flex-column">
        <li class="nav-item"> <a class="nav-link text-center active" id="sidebar-heading" style="padding-left: 0rem;padding-right: 0rem;" href="#">卖家管理系统</a> </li>
        <li class="nav-item mb-1 mt-1"> <a class="nav-link" href="/sell/seller/order/list">订单</a> </li>
        <hr class="feature-divider">
        <li class="nav-item mb-1 mt-1"> <a class="nav-link dropdown-toggle" data-toggle="collapse" href="#collapse-product" role="button" aria-haspopup="true" aria-expanded="false">商品</a>
            <div class="collapse show" id="collapse-product">
                <div class="card card-body">
                    <a class="text-muted" role="button" href="#" style="background-color: transparent; text-decoration: none;">操作</a>
                    <a class="" role="button" href="/sell/seller/product/list">列表</a>
                    <a class="" role="button" href="/sell/seller/product/index">新增</a>
                </div>
            </div>
        </li>
        <hr class="feature-divider">
        <li class="nav-item mb-1 mt-1"> <a class="nav-link dropdown-toggle" data-toggle="collapse" href="#collapse-category" role="button" aria-haspopup="true" aria-expanded="false">类目</a>
            <div class="collapse show" id="collapse-category">
                <div class="card card-body">
                    <a class="text-muted" role="button" href="#" style="background-color: transparent; text-decoration: none;">操作</a>
                    <a class="" role="button" href="/sell/seller/category/list">列表</a>
                    <a class="" role="button" href="/sell/seller/category/index">新增</a>
                </div>
            </div>
        </li>
        <hr class="feature-divider">
        <li class="nav-item mb-1 mt-1"> <a class="nav-link" href="/sell/seller/logout">登出</a> </li>
    </ul>
</nav>