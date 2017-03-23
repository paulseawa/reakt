package com.github.andrewoma.react

fun <T> initProps(properties: T, init: T.() -> Unit): T {
    properties.init()
    return Reakt.flattenProperties(properties)
}

fun Component.text(value: String, init: Component.() -> Unit = {}): Component
        = constructAndInsert(Component({ value }), init)

@JsName("React")
external object ReactPackage {
    @JsName("DOM")
    object DOM {
        @JsName("a")
        @Suppress("UNUSED_PARAMETER")
        fun reactA(props: AProperties, vararg children: Any?): ReactElement<AProperties>
        
        @JsName("abbr")
        @Suppress("UNUSED_PARAMETER")
        fun reactAbbr(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("address")
        @Suppress("UNUSED_PARAMETER")
        fun reactAddress(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("area")
        @Suppress("UNUSED_PARAMETER")
        fun reactArea(props: AreaProperties, vararg children: Any?): ReactElement<AreaProperties>

        @JsName("article")
        @Suppress("UNUSED_PARAMETER")
        fun reactArticle(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("aside")
        @Suppress("UNUSED_PARAMETER")
        fun reactAside(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("audio")
        @Suppress("UNUSED_PARAMETER")
        fun reactAudio(props: AudioProperties, vararg children: Any?): ReactElement<AudioProperties>

        @JsName("b")
        @Suppress("UNUSED_PARAMETER")
        fun reactB(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("base")
        @Suppress("UNUSED_PARAMETER")
        fun reactBase(props: BaseProperties, vararg children: Any?): ReactElement<BaseProperties>

        @JsName("bdi")
        @Suppress("UNUSED_PARAMETER")
        fun reactBdi(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("bdo")
        @Suppress("UNUSED_PARAMETER")
        fun reactBdo(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("big")
        @Suppress("UNUSED_PARAMETER")
        fun reactBig(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("blockquote")
        @Suppress("UNUSED_PARAMETER")
        fun reactBlockquote(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("body")
        @Suppress("UNUSED_PARAMETER")
        fun reactBody(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("br")
        @Suppress("UNUSED_PARAMETER")
        fun reactBr(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("button")
        @Suppress("UNUSED_PARAMETER")
        fun reactButton(props: ButtonProperties, vararg children: Any?): ReactElement<ButtonProperties>

        @JsName("canvas")
        @Suppress("UNUSED_PARAMETER")
        fun reactCanvas(props: CanvasProperties, vararg children: Any?): ReactElement<CanvasProperties>

        @JsName("caption")
        @Suppress("UNUSED_PARAMETER")
        fun reactCaption(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("cite")
        @Suppress("UNUSED_PARAMETER")
        fun reactCite(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("code")
        @Suppress("UNUSED_PARAMETER")
        fun reactCode(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("col")
        @Suppress("UNUSED_PARAMETER")
        fun reactCol(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("colgroup")
        @Suppress("UNUSED_PARAMETER")
        fun reactColgroup(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("data")
        @Suppress("UNUSED_PARAMETER")
        fun reactData(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("datalist")
        @Suppress("UNUSED_PARAMETER")
        fun reactDatalist(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("dd")
        @Suppress("UNUSED_PARAMETER")
        fun reactDd(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("del")
        @Suppress("UNUSED_PARAMETER")
        fun reactDel(props: DelProperties, vararg children: Any?): ReactElement<DelProperties>

        @JsName("details")
        @Suppress("UNUSED_PARAMETER")
        fun reactDetails(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("dfn")
        @Suppress("UNUSED_PARAMETER")
        fun reactDfn(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("div")
        @Suppress("UNUSED_PARAMETER")
        fun reactDiv(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("dl")
        @Suppress("UNUSED_PARAMETER")
        fun reactDl(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("dt")
        @Suppress("UNUSED_PARAMETER")
        fun reactDt(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("em")
        @Suppress("UNUSED_PARAMETER")
        fun reactEm(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("embed")
        @Suppress("UNUSED_PARAMETER")
        fun reactEmbed(props: EmbedProperties, vararg children: Any?): ReactElement<EmbedProperties>

        @JsName("fieldset")
        @Suppress("UNUSED_PARAMETER")
        fun reactFieldset(props: FieldsetProperties, vararg children: Any?): ReactElement<FieldsetProperties>

        @JsName("figcaption")
        @Suppress("UNUSED_PARAMETER")
        fun reactFigcaption(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("figure")
        @Suppress("UNUSED_PARAMETER")
        fun reactFigure(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("footer")
        @Suppress("UNUSED_PARAMETER")
        fun reactFooter(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("form")
        @Suppress("UNUSED_PARAMETER")
        fun reactForm(props: FormProperties, vararg children: Any?): ReactElement<FormProperties>

        @JsName("h1")
        @Suppress("UNUSED_PARAMETER")
        fun reactH1(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("h2")
        @Suppress("UNUSED_PARAMETER")
        fun reactH2(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("h3")
        @Suppress("UNUSED_PARAMETER")
        fun reactH3(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("h4")
        @Suppress("UNUSED_PARAMETER")
        fun reactH4(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("h5")
        @Suppress("UNUSED_PARAMETER")
        fun reactH5(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("h6")
        @Suppress("UNUSED_PARAMETER")
        fun reactH6(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("head")
        @Suppress("UNUSED_PARAMETER")
        fun reactHead(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("header")
        @Suppress("UNUSED_PARAMETER")
        fun reactHeader(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("hr")
        @Suppress("UNUSED_PARAMETER")
        fun reactHr(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("html")
        @Suppress("UNUSED_PARAMETER")
        fun reactHtml(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("i")
        @Suppress("UNUSED_PARAMETER")
        fun reactI(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

        @JsName("iframe")
        @Suppress("UNUSED_PARAMETER")
        fun reactIframe(props: IframeProperties, vararg children: Any?): ReactElement<IframeProperties>

        @JsName("img")
        @Suppress("UNUSED_PARAMETER")
        fun reactImg(props: ImgProperties, vararg children: Any?): ReactElement<ImgProperties>

        @JsName("input")
       @Suppress("UNUSED_PARAMETER")
       fun reactInput(props: InputProperties, vararg children: Any?): ReactElement<InputProperties>

       @JsName("ins")
       @Suppress("UNUSED_PARAMETER")
       fun reactIns(props: InsProperties, vararg children: Any?): ReactElement<InsProperties>


       @JsName("kbd")
       @Suppress("UNUSED_PARAMETER")
       fun reactKbd(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

       @JsName("keygen")
       @Suppress("UNUSED_PARAMETER")
       fun reactKeygen(props: KeygenProperties, vararg children: Any?): ReactElement<KeygenProperties>


       @JsName("label")
       @Suppress("UNUSED_PARAMETER")
       fun reactLabel(props: LabelProperties, vararg children: Any?): ReactElement<LabelProperties>

       @JsName("legend")
       @Suppress("UNUSED_PARAMETER")
       fun reactLegend(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

       @JsName("li")
       @Suppress("UNUSED_PARAMETER")
       fun reactLi(props: LiProperties, vararg children: Any?): ReactElement<LiProperties>

       @JsName("link")
       @Suppress("UNUSED_PARAMETER")
       fun reactLink(props: LinkProperties, vararg children: Any?): ReactElement<LinkProperties>


       @JsName("main")
       @Suppress("UNUSED_PARAMETER")
       fun reactMain(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>


       @JsName("map")
       @Suppress("UNUSED_PARAMETER")
       fun reactMap(props: MapProperties, vararg children: Any?): ReactElement<MapProperties>


       @JsName("mark")
       @Suppress("UNUSED_PARAMETER")
       fun reactMark(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>


       @JsName("menu")
       @Suppress("UNUSED_PARAMETER")
       fun reactMenu(props: MenuProperties, vararg children: Any?): ReactElement<MenuProperties>


       @JsName("menuitem")
       @Suppress("UNUSED_PARAMETER")
       fun reactMenuitem(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>


       @JsName("meta")
       @Suppress("UNUSED_PARAMETER")
       fun reactMeta(props: MetaProperties, vararg children: Any?): ReactElement<MetaProperties>


       @JsName("meter")
       @Suppress("UNUSED_PARAMETER")
       fun reactMeter(props: MeterProperties, vararg children: Any?): ReactElement<MeterProperties>


       @JsName("nav")
       @Suppress("UNUSED_PARAMETER")
       fun reactNav(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>


       @JsName("noscript")
       @Suppress("UNUSED_PARAMETER")
       fun reactNoscript(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>


       @JsName("object")
       @Suppress("UNUSED_PARAMETER")
       fun reactObject(props: ObjectProperties, vararg children: Any?): ReactElement<ObjectProperties>


       @JsName("ol")
       @Suppress("UNUSED_PARAMETER")
       fun reactOl(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>


       @JsName("optgroup")
       @Suppress("UNUSED_PARAMETER")
       fun reactOptgroup(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>


       @JsName("option")
       @Suppress("UNUSED_PARAMETER")
       fun reactOption(props: OptionProperties, vararg children: Any?): ReactElement<OptionProperties>


       @JsName("output")
       @Suppress("UNUSED_PARAMETER")
       fun reactOutput(props: OutputProperties, vararg children: Any?): ReactElement<OutputProperties>

       @JsName("p")
       @Suppress("UNUSED_PARAMETER")
       fun reactP(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>


       @JsName("param")
       @Suppress("UNUSED_PARAMETER")
       fun reactParam(props: ParamProperties, vararg children: Any?): ReactElement<ParamProperties>


       @JsName("pre")
       @Suppress("UNUSED_PARAMETER")
       fun reactPre(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>


       @JsName("progress")
       @Suppress("UNUSED_PARAMETER")
       fun reactProgress(props: ProgressProperties, vararg children: Any?): ReactElement<ProgressProperties>


       @JsName("q")
       @Suppress("UNUSED_PARAMETER")
       fun reactQ(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>


       @JsName("rp")
       @Suppress("UNUSED_PARAMETER")
       fun reactRp(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>


       @JsName("rt")
       @Suppress("UNUSED_PARAMETER")
       fun reactRt(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>


       @JsName("ruby")
       @Suppress("UNUSED_PARAMETER")
       fun reactRuby(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>


       @JsName("s")
       @Suppress("UNUSED_PARAMETER")
       fun reactS(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>


       @JsName("samp")
       @Suppress("UNUSED_PARAMETER")
       fun reactSamp(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

       @JsName("script")
       @Suppress("UNUSED_PARAMETER")
       fun reactScript(props: ScriptProperties, vararg children: Any?): ReactElement<ScriptProperties>


       @JsName("section")
       @Suppress("UNUSED_PARAMETER")
       fun reactSection(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

       @JsName("select")
       @Suppress("UNUSED_PARAMETER")
       fun reactSelect(props: SelectProperties, vararg children: Any?): ReactElement<SelectProperties>


       @JsName("small")
       @Suppress("UNUSED_PARAMETER")
       fun reactSmall(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>


       @JsName("source")
       @Suppress("UNUSED_PARAMETER")
       fun reactSource(props: SourceProperties, vararg children: Any?): ReactElement<SourceProperties>


       @JsName("span")
       @Suppress("UNUSED_PARAMETER")
       fun reactSpan(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>


       @JsName("strong")
       @Suppress("UNUSED_PARAMETER")
       fun reactStrong(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>


       @JsName("style")
       @Suppress("UNUSED_PARAMETER")
       fun reactStyle(props: StyleProperties, vararg children: Any?): ReactElement<StyleProperties>


       @JsName("sub")
       @Suppress("UNUSED_PARAMETER")
       fun reactSub(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>


       @JsName("summary")
       @Suppress("UNUSED_PARAMETER")
       fun reactSummary(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>


       @JsName("sup")
       @Suppress("UNUSED_PARAMETER")
       fun reactSup(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>


       @JsName("table")
       @Suppress("UNUSED_PARAMETER")
       fun reactTable(props: TableProperties, vararg children: Any?): ReactElement<TableProperties>


       @JsName("tbody")
       @Suppress("UNUSED_PARAMETER")
       fun reactTbody(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>


       @JsName("td")
       @Suppress("UNUSED_PARAMETER")
       fun reactTd(props: TdProperties, vararg children: Any?): ReactElement<TdProperties>


       @JsName("textarea")
       @Suppress("UNUSED_PARAMETER")
       fun reactTextarea(props: TextareaProperties, vararg children: Any?): ReactElement<TextareaProperties>

       @JsName("tfoot")
       @Suppress("UNUSED_PARAMETER")
       fun reactTfoot(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

       @JsName("th")
       @Suppress("UNUSED_PARAMETER")
       fun reactTh(props: ThProperties, vararg children: Any?): ReactElement<ThProperties>

       @JsName("thead")
       @Suppress("UNUSED_PARAMETER")
       fun reactThead(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

       @JsName("time")
       @Suppress("UNUSED_PARAMETER")
       fun reactTime(props: TimeProperties, vararg children: Any?): ReactElement<TimeProperties>

       @JsName("title")
       @Suppress("UNUSED_PARAMETER")
       fun reactTitle(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

       @JsName("tr")
       @Suppress("UNUSED_PARAMETER")
       fun reactTr(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

       @JsName("track")
       @Suppress("UNUSED_PARAMETER")
       fun reactTrack(props: TrackProperties, vararg children: Any?): ReactElement<TrackProperties>

       @JsName("u")
       @Suppress("UNUSED_PARAMETER")
       fun reactU(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

       @JsName("ul")
       @Suppress("UNUSED_PARAMETER")
       fun reactUl(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

       @JsName("var")
       @Suppress("UNUSED_PARAMETER")
       fun reactVar(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

       @JsName("video")
       @Suppress("UNUSED_PARAMETER")
       fun reactVideo(props: VideoProperties, vararg children: Any?): ReactElement<VideoProperties>

       @JsName("wbr")
       @Suppress("UNUSED_PARAMETER")
       fun reactWbr(props: HtmlGlobalProperties, vararg children: Any?): ReactElement<HtmlGlobalProperties>

       @JsName("circle")
       @Suppress("UNUSED_PARAMETER")
       fun reactCircle(props: SvgProperties, vararg children: Any?): ReactElement<SvgProperties>

       @JsName("g")
       @Suppress("UNUSED_PARAMETER")
       fun reactG(props: SvgProperties, vararg children: Any?): ReactElement<SvgProperties>

       @JsName("line")
       @Suppress("UNUSED_PARAMETER")
       fun reactLine(props: SvgProperties, vararg children: Any?): ReactElement<SvgProperties>

       @JsName("path")
       @Suppress("UNUSED_PARAMETER")
       fun reactPath(props: SvgProperties, vararg children: Any?): ReactElement<SvgProperties>

       @JsName("polygon")
       @Suppress("UNUSED_PARAMETER")
       fun reactPolygon(props: SvgProperties, vararg children: Any?): ReactElement<SvgProperties>

       @JsName("polyline")
       @Suppress("UNUSED_PARAMETER")
       fun reactPolyline(props: SvgProperties, vararg children: Any?): ReactElement<SvgProperties>

       @JsName("rect")
       @Suppress("UNUSED_PARAMETER")
       fun reactRect(props: SvgProperties, vararg children: Any?): ReactElement<SvgProperties>

       @JsName("svg")
       @Suppress("UNUSED_PARAMETER")
       fun reactSvg(props: SvgProperties, vararg children: Any?): ReactElement<SvgProperties>

       @JsName("text")
       @Suppress("UNUSED_PARAMETER")
       fun reactText(props: SvgProperties, vararg children: Any?): ReactElement<SvgProperties>

    }
}

fun Component.a(properties: AProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactA(initProps(AProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.abbr(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactAbbr(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.address(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactAddress(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.area(properties: AreaProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactArea(initProps(AreaProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.article(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactArticle(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.aside(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactAside(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.audio(properties: AudioProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactAudio(initProps(AudioProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.b(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactB(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.base(properties: BaseProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactBase(initProps(BaseProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.bdi(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactBdi(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.bdo(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactBdo(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.big(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactBig(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.blockquote(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactBlockquote(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.body(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactBody(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.br(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactBr(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.button(properties: ButtonProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactButton(initProps(ButtonProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.canvas(properties: CanvasProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactCanvas(initProps(CanvasProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.caption(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactCaption(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.cite(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactCite(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.code(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactCode(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.col(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactCol(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.colgroup(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactColgroup(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.data(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactData(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.datalist(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactDatalist(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.dd(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactDd(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.del(properties: DelProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactDel(initProps(DelProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.details(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactDetails(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.dfn(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactDfn(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.div(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactDiv(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.dl(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactDl(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.dt(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactDt(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.em(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactEm(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.embed(properties: EmbedProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactEmbed(initProps(EmbedProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.fieldset(properties: FieldsetProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactFieldset(initProps(FieldsetProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.figcaption(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactFigcaption(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.figure(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactFigure(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.footer(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactFooter(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.form(properties: FormProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactForm(initProps(FormProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.h1(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactH1(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.h2(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactH2(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.h3(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactH3(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.h4(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactH4(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.h5(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactH5(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.h6(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactH6(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.head(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactHead(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.header(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactHeader(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.hr(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactHr(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.html(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactHtml(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.i(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactI(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.iframe(properties: IframeProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactIframe(initProps(IframeProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.img(properties: ImgProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactImg(initProps(ImgProperties(), properties), *it.transformChildren()) }), init)
}


fun Component.input(properties: InputProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactInput(initProps(InputProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.ins(properties: InsProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactIns(initProps(InsProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.kbd(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactKbd(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.keygen(properties: KeygenProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactKeygen(initProps(KeygenProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.label(properties: LabelProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactLabel(initProps(LabelProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.legend(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactLegend(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.li(properties: LiProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactLi(initProps(LiProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.link(properties: LinkProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactLink(initProps(LinkProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.main(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactMain(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.map(properties: MapProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactMap(initProps(MapProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.mark(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactMark(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.menu(properties: MenuProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactMenu(initProps(MenuProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.menuitem(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactMenuitem(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.meta(properties: MetaProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactMeta(initProps(MetaProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.meter(properties: MeterProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactMeter(initProps(MeterProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.nav(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactNav(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.noscript(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactNoscript(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.obj(properties: ObjectProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactObject(initProps(ObjectProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.ol(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactOl(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.optgroup(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactOptgroup(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.option(properties: OptionProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactOption(initProps(OptionProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.output(properties: OutputProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactOutput(initProps(OutputProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.p(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactP(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.param(properties: ParamProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactParam(initProps(ParamProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.pre(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactPre(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.progress(properties: ProgressProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactProgress(initProps(ProgressProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.q(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactQ(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.rp(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactRp(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.rt(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactRt(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.ruby(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactRuby(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.s(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactS(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.samp(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactSamp(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.script(properties: ScriptProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactScript(initProps(ScriptProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.section(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactSection(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.select(properties: SelectProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactSelect(initProps(SelectProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.small(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactSmall(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.source(properties: SourceProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactSource(initProps(SourceProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.span(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactSpan(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.strong(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactStrong(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.style(properties: StyleProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactStyle(initProps(StyleProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.sub(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactSub(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.summary(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactSummary(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.sup(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactSup(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.table(properties: TableProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactTable(initProps(TableProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.tbody(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactTbody(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.td(properties: TdProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactTd(initProps(TdProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.textarea(properties: TextareaProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactTextarea(initProps(TextareaProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.tfoot(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactTfoot(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.th(properties: ThProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactTh(initProps(ThProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.thead(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactThead(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.time(properties: TimeProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactTime(initProps(TimeProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.title(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactTitle(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.tr(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactTr(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.track(properties: TrackProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactTrack(initProps(TrackProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.u(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactU(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.ul(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactUl(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.variable(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactVar(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.video(properties: VideoProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactVideo(initProps(VideoProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.wbr(properties: HtmlGlobalProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactWbr(initProps(HtmlGlobalProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.circle(properties: SvgProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactCircle(initProps(SvgProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.g(properties: SvgProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactG(initProps(SvgProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.line(properties: SvgProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactLine(initProps(SvgProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.path(properties: SvgProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactPath(initProps(SvgProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.polygon(properties: SvgProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactPolygon(initProps(SvgProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.polyline(properties: SvgProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactPolyline(initProps(SvgProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.rect(properties: SvgProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactRect(initProps(SvgProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.svg(properties: SvgProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactSvg(initProps(SvgProperties(), properties), *it.transformChildren()) }), init)
}

fun Component.text(properties: SvgProperties.() -> Unit = {}, init: Component.() -> Unit = {}): Component {
    return constructAndInsert(Component({ ReactPackage.DOM.reactText(initProps(SvgProperties(), properties), *it.transformChildren()) }), init)
}
