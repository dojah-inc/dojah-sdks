# coding: utf-8

"""
    DOJAH Publilc APIs

    Use Dojah to verify, onboard and manage user identity across Africa!

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""

from dojah_client.paths.api_v1_webhook_delete.delete import DeleteWebhook
from dojah_client.paths.api_v1_webhook_fetch.get import GetWebhooks
from dojah_client.paths.api_v1_webhook_notify.post import NotifyWebhook
from dojah_client.paths.api_v1_webhook_subscribe.post import SubscribeService


class WebHooksApi(
    DeleteWebhook,
    GetWebhooks,
    NotifyWebhook,
    SubscribeService,
):
    """NOTE:
    This class is auto generated by Konfig (https://konfigthis.com)
    """
    pass