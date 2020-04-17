package highlightedrecommendation.configuration;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

import aQute.bnd.annotation.metatype.Meta;

@ExtendedObjectClassDefinition(
   category = "Other",
   scope = ExtendedObjectClassDefinition.Scope.PORTLET_INSTANCE
)
@Meta.OCD(
   id = "highlightedrecommendation.configuration.HighlightedRecommendationConfiguration",
   name = "HighlightedRecommendationConfiguration"
   )
public interface HighlightedRecommendationConfiguration {

    @Meta.AD(
        deflt = "",
        required = false
    )
    public String articleToRecommend();
}