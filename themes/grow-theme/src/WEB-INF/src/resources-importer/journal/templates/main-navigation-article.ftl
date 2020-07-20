<div class="breadcrumb-wrap" id="permalinks">
	<div class="container">
		<div class="row">
			<ul class="nav nav-justified nav-pills">
			<#if Label.getSiblings()?has_content>
				<#list Label.getSiblings() as entry>
				<li>
					<h4 class="text-center">
						<a href="${entry.Link.getData()}"target="">
							${entry.getData()}
						</a>
					</h4>
				</li>
				</#list>
			</#if>
			</ul>
		</div>
	</div>
</div>