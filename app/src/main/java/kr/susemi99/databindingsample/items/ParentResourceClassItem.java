package kr.susemi99.databindingsample.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ParentResourceClassItem
{
  @JsonProperty("SeoulJungNangWomenResourcesClass")
  public ResourceClassItem resourceClassItem;
}
