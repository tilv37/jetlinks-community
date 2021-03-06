package org.jetlinks.community.notify.event;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.jetlinks.community.notify.template.Template;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Map;

@Getter
@Setter
@Builder
public class SerializableNotifierEvent {

    private boolean success;

    @Nullable
    private String errorType;

    @Nullable
    private String cause;

    @Nonnull
    private String notifierId;

    @Nonnull
    private String notifyType;

    @Nonnull
    private String provider;

    @Nullable
    private String templateId;

    @Nullable
    private Template template;

    @Nonnull
    private Map<String,Object> context;
}
