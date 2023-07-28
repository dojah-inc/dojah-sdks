/*
 * DOJAH Publilc APIs
 *
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Dojah.Net.Client.OpenAPIDateConverter;

namespace Dojah.Net.Model
{
    /// <summary>
    /// VerificationsVerifySelfieVninRequest
    /// </summary>
    [DataContract(Name = "VerificationsVerifySelfieVninRequest")]
    public partial class VerificationsVerifySelfieVninRequest : IEquatable<VerificationsVerifySelfieVninRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VerificationsVerifySelfieVninRequest" /> class.
        /// </summary>
        /// <param name="vnin">vnin.</param>
        /// <param name="selfieImage">selfieImage.</param>
        public VerificationsVerifySelfieVninRequest(string vnin = default(string), string selfieImage = default(string))
        {
            this.Vnin = vnin;
            this.SelfieImage = selfieImage;
        }

        /// <summary>
        /// Gets or Sets Vnin
        /// </summary>
        [DataMember(Name = "vnin", EmitDefaultValue = false)]
        public string Vnin { get; set; }

        /// <summary>
        /// Gets or Sets SelfieImage
        /// </summary>
        [DataMember(Name = "selfie_image", EmitDefaultValue = false)]
        public string SelfieImage { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class VerificationsVerifySelfieVninRequest {\n");
            sb.Append("  Vnin: ").Append(Vnin).Append("\n");
            sb.Append("  SelfieImage: ").Append(SelfieImage).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as VerificationsVerifySelfieVninRequest);
        }

        /// <summary>
        /// Returns true if VerificationsVerifySelfieVninRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of VerificationsVerifySelfieVninRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VerificationsVerifySelfieVninRequest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Vnin == input.Vnin ||
                    (this.Vnin != null &&
                    this.Vnin.Equals(input.Vnin))
                ) && 
                (
                    this.SelfieImage == input.SelfieImage ||
                    (this.SelfieImage != null &&
                    this.SelfieImage.Equals(input.SelfieImage))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Vnin != null)
                {
                    hashCode = (hashCode * 59) + this.Vnin.GetHashCode();
                }
                if (this.SelfieImage != null)
                {
                    hashCode = (hashCode * 59) + this.SelfieImage.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}