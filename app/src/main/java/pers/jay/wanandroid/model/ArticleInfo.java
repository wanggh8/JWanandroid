package pers.jay.wanandroid.model;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.List;

import pers.jay.wanandroid.model.dbconverter.ArticleConverter;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class ArticleInfo {

        /**
         * curPage : 1
         * datas : [{"apkLink":"","author":"MannaYang","chapterId":97,"chapterName":"音视频","collectInside":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":8824,"link":"https://juejin.im/post/5d42d4946fb9a06ae439d46b","niceDate":"22分钟前","origin":"","prefix":"","projectLink":"","publishTime":1564713410000,"superChapterId":97,"superChapterName":"多媒体技术","tags":[],"title":"Android 基于MediaCodec+MediaMuxer实现音视频录制合成","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":" coder-pig","chapterId":74,"chapterName":"反编译","collectInside":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":8823,"link":"https://juejin.im/post/5d42f440e51d4561e53538b6","niceDate":"33分钟前","origin":"","prefix":"","projectLink":"","publishTime":1564712761000,"superChapterId":74,"superChapterName":"热门专题","tags":[],"title":"忘了他吧！我偷别人APP的代码养你","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"西瓜技术团队","chapterId":78,"chapterName":"性能优化","collectInside":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":8822,"link":"https://mp.weixin.qq.com/s/ZHisCVjO_ZrtvvEWBYUQFQ","niceDate":"13小时前","origin":"","prefix":"","projectLink":"","publishTime":1564667263000,"superChapterId":74,"superChapterName":"热门专题","tags":[],"title":"西瓜视频apk瘦身之 Java access 方法删除","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"xiaoyang","chapterId":440,"chapterName":"官方","collectInside":false,"courseId":13,"desc":"<p>很多时候我们开发项目的时候，都需要抓包，很多情况下即使是Https也能正常抓包正常。<\/p>\r\n<p>那么问题来了：<\/p>\r\n<ol>\r\n<li>抓包的原理是？<\/li>\r\n<li>任何Https的 <strong>app<\/strong> 都能抓的到吗？<\/li>\r\n<li>如果不能，哪些情况下可以抓取，哪些情况下抓取不到？<\/li>\r\n<\/ol>","envelopePic":"","fresh":true,"id":8812,"link":"https://www.wanandroid.com/wenda/show/8812","niceDate":"13小时前","origin":"","prefix":"","projectLink":"","publishTime":1564667071000,"superChapterId":440,"superChapterName":"问答","tags":[{"name":"问答","url":"/article/list/0?cid=440"}],"title":"每日一问 app https 抓包，一定能抓到吗？","type":0,"userId":2,"visible":1,"zan":7},{"apkLink":"","author":"张小fanfan","chapterId":228,"chapterName":"辅助 or 工具类","collectInside":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8820,"link":"https://juejin.im/post/5d3eb7325188255d7a07582b","niceDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1564588657000,"superChapterId":135,"superChapterName":"项目必备","tags":[],"title":"Android 换肤那些事儿， Resource包装流 ？AssetManager替换流？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":" 杨充","chapterId":121,"chapterName":"ViewPager","collectInside":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8819,"link":"https://juejin.im/post/5d401cabf265da03a53a12fe","niceDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1564588596000,"superChapterId":26,"superChapterName":"常用控件","tags":[],"title":"PagerAdapter深度解析和实践优化","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"code小生","chapterId":414,"chapterName":"code小生","collectInside":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8818,"link":"https://mp.weixin.qq.com/s/2TTXt5virr2vMNZRlzIT3w","niceDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1564588566000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"如何开发一款高性能的 gradle transform","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"全世界_Coder","chapterId":481,"chapterName":"DNS","collectInside":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8817,"link":"https://juejin.im/post/5d40eae66fb9a06b2442f898","niceDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1564588391000,"superChapterId":98,"superChapterName":"网络访问","tags":[],"title":"网络优化篇-从DNS开始","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Rouse","chapterId":480,"chapterName":"Paging","collectInside":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8816,"link":"https://juejin.im/post/5d40cbb3f265da03c4286b19","niceDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1564586027000,"superChapterId":423,"superChapterName":"Jetpack","tags":[],"title":"Paging在RecyclerView中的应用，有这一篇就够了","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"齐翊","chapterId":99,"chapterName":"具体案例","collectInside":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8815,"link":"https://juejin.im/post/5d3fdc3af265da03c02bdbde","niceDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1564581142000,"superChapterId":99,"superChapterName":"自定义控件","tags":[],"title":"Android侧滑原来可以这么优雅","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Aleyn.","chapterId":251,"chapterName":"OpenCV","collectInside":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8814,"link":"https://blog.csdn.net/qq_36875339/article/details/97127908","niceDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1564576645000,"superChapterId":74,"superChapterName":"热门专题","tags":[],"title":"移动端车牌识别OCR,结合OpenCV","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"xiaoyang","chapterId":440,"chapterName":"官方","collectInside":false,"courseId":13,"desc":"<h1>大家都知道，很多时候我们说&quot;Android16.6ms刷新一次屏幕&quot;<\/h1>\r\n<p>那么问题是：<\/p>\r\n<p>这个16.6ms刷新一次屏幕是什么意思呢？是每隔16.6ms都会调用一次View的onDraw么？<\/p>\r\n<p>如果不是？<\/p>\r\n<p>那是什么样的一个刷新机制，这个机制在Android版本迭代中有无变化。<\/p>\r\n<blockquote>\r\n<p>本周1/3，现在问答支持markdown啦，自由玩耍吧。<\/p>\r\n<\/blockquote>","envelopePic":"","fresh":false,"id":8808,"link":"https://www.wanandroid.com/wenda/show/8808","niceDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1564494800000,"superChapterId":440,"superChapterName":"问答","tags":[{"name":"问答","url":"/article/list/0?cid=440"}],"title":"每日一问 很多时候我们说&quot;Android16.6ms刷新一次屏幕&quot; 正确吗？","type":0,"userId":2,"visible":1,"zan":9},{"apkLink":"","author":"看书的小蜗牛","chapterId":479,"chapterName":"Bitmap","collectInside":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8811,"link":"https://www.jianshu.com/p/d5714e8987f3","niceDate":"2019-07-28","origin":"","prefix":"","projectLink":"","publishTime":1564319342000,"superChapterId":86,"superChapterName":"图片加载","tags":[],"title":"Android Bitmap变迁与原理解析（4.x-8.x）","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":" 滑板上的老砒霜","chapterId":390,"chapterName":"Git","collectInside":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8810,"link":"https://juejin.im/post/5d35a9fff265da1bc94f2c76","niceDate":"2019-07-28","origin":"","prefix":"","projectLink":"","publishTime":1564313900000,"superChapterId":390,"superChapterName":"项目管理","tags":[],"title":"Git 规范检测：百臂巨人与塔尔塔罗斯","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":" 艾神一不小心","chapterId":131,"chapterName":"蓝牙","collectInside":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8809,"link":"https://juejin.im/post/5d37d4d6f265da1bc414958a","niceDate":"2019-07-28","origin":"","prefix":"","projectLink":"","publishTime":1564312897000,"superChapterId":132,"superChapterName":"硬件模块","tags":[],"title":"Android BLE蓝牙踩坑总结","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"xiaoyang","chapterId":440,"chapterName":"官方","collectInside":false,"courseId":13,"desc":"<p>一次在把app module修改为lib module时发现，switch竟然要改成if else ，从而发现这个问题。<\/p><br><p>为什么呢？<\/p><br><p>有什么好的解决方案？<\/p>","envelopePic":"","fresh":false,"id":8735,"link":"https://www.wanandroid.com/wenda/show/8735","niceDate":"2019-07-28","origin":"","prefix":"","projectLink":"","publishTime":1564312282000,"superChapterId":440,"superChapterName":"问答","tags":[{"name":"问答","url":"/article/list/0?cid=440"}],"title":"每日一问 为什么Android app module下的R.java中变量为final，而lib module中R.java中的变量非final呢？","type":0,"userId":2,"visible":1,"zan":6},{"apkLink":"","author":" 灯不利多","chapterId":78,"chapterName":"性能优化","collectInside":true,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8736,"link":"https://juejin.im/post/5d3ada056fb9a07eb94fd1bc","niceDate":"2019-07-26","origin":"","prefix":"","projectLink":"","publishTime":1564153799000,"superChapterId":74,"superChapterName":"热门专题","tags":[],"title":"探索 Android 内存优化方法","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"鸿洋","chapterId":408,"chapterName":"鸿洋","collectInside":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8764,"link":"https://mp.weixin.qq.com/s/QhOGJ51Cc0hUFX6ErGtr0w","niceDate":"2019-07-26","origin":"","prefix":"","projectLink":"","publishTime":1564070400000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"我在一个群分享Android 好像被我分享得没人说话了... 4期","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"郭霖","chapterId":409,"chapterName":"郭霖","collectInside":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8790,"link":"https://mp.weixin.qq.com/s/91gvgalgwag44gdluPIvLg","niceDate":"2019-07-26","origin":"","prefix":"","projectLink":"","publishTime":1564070400000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"好奇一键登录是怎么实现的吗？进来了解一下？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"xiaoyang","chapterId":440,"chapterName":"官方","collectInside":false,"courseId":13,"desc":"<p>上一个问题，我们提问了Handler的同步屏障机制，除此以外，还有个比较有意思的对象：<\/p><br><p>IdleHandler<br><\/p><br><p>1. 它有什么能力？<\/p><p>2. 它有什么用处？<\/p><p>3. 能想到一些合适的场景么。<\/p><br><p>本周2/3.<\/p><br><p>本计划这周把编辑器改成markdown的，不过忘了带电脑回家，目测需要到8月中旬了。<\/p><br>","envelopePic":"","fresh":false,"id":8723,"link":"https://www.wanandroid.com/wenda/show/8723","niceDate":"2019-07-25","origin":"","prefix":"","projectLink":"","publishTime":1564060179000,"superChapterId":440,"superChapterName":"问答","tags":[{"name":"问答","url":"/article/list/0?cid=440"}],"title":"每日一问 听说过Handler中的IdleHandler吗？","type":0,"userId":2,"visible":1,"zan":9}]
         * offset : 0
         * over : false
         * pageCount : 342
         * size : 20
         * total : 6840
         */

        @Id(autoincrement = true)
        private Long id;
        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        @Convert(converter = ArticleConverter.class, columnType = String.class)
        private List<Article> datas;

        @Generated(hash = 1662640631)
        public ArticleInfo(Long id, int curPage, int offset, boolean over, int pageCount, int size, int total, List<Article> datas) {
            this.id = id;
            this.curPage = curPage;
            this.offset = offset;
            this.over = over;
            this.pageCount = pageCount;
            this.size = size;
            this.total = total;
            this.datas = datas;
        }

        @Generated(hash = 895234147)
        public ArticleInfo() {
        }

        public int getCurPage() { return curPage;}

        public void setCurPage(int curPage) { this.curPage = curPage;}

        public int getOffset() { return offset;}

        public void setOffset(int offset) { this.offset = offset;}

        public boolean isOver() { return over;}

        public void setOver(boolean over) { this.over = over;}

        public int getPageCount() { return pageCount;}

        public void setPageCount(int pageCount) { this.pageCount = pageCount;}

        public int getSize() { return size;}

        public void setSize(int size) { this.size = size;}

        public int getTotal() { return total;}

        public void setTotal(int total) { this.total = total;}

        public List<Article> getDatas() { return datas;}

        public void setDatas(List<Article> datas) { this.datas = datas;}

        public Long getId() {
            return this.id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public boolean getOver() {
            return this.over;
        }

}
