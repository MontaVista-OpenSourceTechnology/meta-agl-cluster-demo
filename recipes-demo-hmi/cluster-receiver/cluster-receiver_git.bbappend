FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
    file://0001-Update-omxh264dec-parameter.patch \
"
